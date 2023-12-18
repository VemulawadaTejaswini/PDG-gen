import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // 入力
        int n = sc.nextInt();
      	int k = sc.nextInt();
      	long[] map=new long[n];
      	int[] jump = new int[n];
      
      	for(int i=0;i<n;i++){
          map[i]=0;
          jump[i]=(int)1e6;
        }
      	
      	int c=0;
      	for(int i=0;i<k;i++){
          int a=sc.nextInt();
          int b=sc.nextInt();
          for(int j=a;j<=b;j++){
            jump[c]=j;
            c+=1;
          }
        }
      	Arrays.sort(jump);
      
      	/*for(int i=0;i<n;i++){
          System.out.println(jump[i]);
        }*/
      	map[0]=1;
      	for(int i=0;i<n-1;i++){
          for(int j=0;;j++){
            if(i+jump[j]<n){
              map[i+jump[j]]=
                (map[i+jump[j]]+map[i])%(998244353);
            }else{
              break;
            }
          }
        }
      
      	/*for(int i=0;i<n;i++){
          System.out.print(map[i]);
        }
        */
      	
      

      System.out.println(map[n-1]);
      
    }
}






