import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
      	int[] a = new int[5];
        for(int i=0;i<5;i++){
          a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean flg = true;
        for(int i=0;i<4;i++){
          for(int j=i+1;j<5;j++){
            if(a[j]-a[i] > k){
              flg=false;
              break;
            }
          }
          if(!flg)break;
        }
        if(flg){
          System.out.println("Yay!");
        }else{
          System.out.println(":(");
        }
	}
}