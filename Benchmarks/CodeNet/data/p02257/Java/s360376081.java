import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int num = 0;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    class Inner{
      boolean inner(int x){
        if(x == 2){
          return true;
        }else if(x < 2 || x%2 == 0){
          return false;
        }else{
        	int i = 3;
        	while(i <= Math.sqrt(x)){
          		if(x%i == 0){
            		return false;
          		}
          		i = i + 2;
        	}
        	return true;
        }
      }
    }
    Inner in = new Inner();
    for(int aa : a){
      if(in.inner(aa)){
        num++;
      }
    }
    System.out.println(num);
  }
}

