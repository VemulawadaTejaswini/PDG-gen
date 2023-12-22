import java.util.*;
class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int N = sc.nextInt();
    int[] num = new int[N];
    int suanchang=0;
    
    for (int i = 0,j; i < N; i++) {
             num[i] = sc.nextInt();
        }
    
    for(int i=0;i<num.length-1;i++){
        
        for(int j=0;j<num.length-i-1;j++){
            
            if(num[j]>num[j+1]){
                int temp = num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
                suanchang++;
            }

        }
    }

    
    for(int i=0;i<num.length-1;i++){
        System.out.print(num[i] + " ");
 }
     System.out.print(num[N-1]);
     System.out.println();
     System.out.println(suanchang);
  }
 
   }
