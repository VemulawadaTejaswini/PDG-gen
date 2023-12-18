import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A[]=new int[N];
        int m;
        int a;
        int b;

        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        
        for(int k=0; k<N-1; k++){
            
            for(int l=k+1; l<N; l++){
                a = A[k];
                b = A[l];
                
                while((m=(a%b))!=0){
                    a=b;
                    b=m;

                }
                if(b!=1){
                    b=A[0];
                    for(int z=1; z<N; z++){
                        
                            a=b;
                            b=A[z];
                            while((m=(a%b))!=0){
                                a=b;
                                b=m;
            
                            }

                            if(b!=1){
                                System.out.println("not coprime");
                                return;
                            }



                    }
                    System.out.println("setwise coprime");
                    return;


                }

            }
        }
            
          System.out.println("pairwise coprime");
        }
    }