import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[m+1];
    int b[] = new int[m+1];
    int answer = 0;
    int maxb = -1;
    int maxidx = -1;
    int work = 1;
    boolean flag = true;
	boolean hflag == true;
    for(int i = 1; i <= m; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    if(n == 1){
      for(int i = 1; i <= m; i++){
        if(a[i] == 1 && b[i] == 1){
          flag = false;
          break;
        }
      }
      if(!flag){
        System.out.println(1);
      }else{
        System.out.println("Impossible");
      }
    }else if(n == 2){
		boolean aflag = false;
		boolean bflag = false;
		int aidx = -1;
		int bidx = -1;
		for(int i = 1; i <= m; i++){
			if(a[i] == 1){
				aflag = true;
				aidx = i;
			}
			if(b[i] == 2){
				bflag = true;
				bidx = i;
			}
		}
		if(aflag && bflag){
			if(aidx != bidx){
				System.out.println(2);
			}else{
				System.out.println(1);
			}
		}else{
			System.out.println("Impossible");
		}
    }else{
      while(work < n){
        maxb = -1;
        for(int i = 1; i <= m; i++){
		  if(hflag){
		  	if(a[i] <= 1){
			  if(b[i] > maxb){
                maxb = b[i];
                maxidx = i;
              }
		  	}
		  }else{
            if(a[i] <= work+1){
              if(b[i] > maxb){
                maxb = b[i];
                maxidx = i;
              }
          	}
		  }
        }
        if(maxb == -1){
          flag = false;
          break;
        }else{
          answer++;
          work = maxb;
          a[maxidx] = 101;
          b[maxidx] = 101;
		  hflag = false;
        }
      }
      if(flag){
        System.out.println(answer);
      }else{
        System.out.println("Impossible");
      }
    }
  }
}

