import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n,v,flag,a;
        int []A;
        
        n = scan.nextInt();
        A = new int[n];
        
        for (int i = 0;i<n; i++){
            A[i]=scan.nextInt();
        }
            
            //bubble sort
            flag=1;
            a = 0;
            while (flag==1){
                flag=0;
                    for(int j = n-1;j<=1;j--){
                        if (A[j] > A[j-1]){
                            v = A[j];
                            A[j]=A[j-1];
                            A[j-1] = v;
                            a=a++;
                        }
                    }
                flag=1;
            }          
            
    System.out.println(A[n]);
    System.out.println(a);
            
    }
}