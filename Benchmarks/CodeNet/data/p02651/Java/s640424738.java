import java.util.Scanner;

class Main{
	public static void main(String[] args){
      	int x = 0;
    	Scanner sc = new Scanner(System.in);
      	int T = sc.nextInt();
      	for(int j = 0; j < T; j++){

        	int N = sc.nextInt();
          	int[] A;
          	A = new int[N];
          	for(int i=0;i<N;i++){
              //Nラウンド繰り返す
            	A[i] = sc.nextInt();
                }
          	String S = sc.next();
          	for(int i=0;i<N;i++){
              char SI = S.charAt(i);
              if(SI=='0'){
              	if(x==0){
                	
                }else{
                	x = x ^ A[i];
                }
              }
              if(SI=='1'){
              	if(x==0){
                	x = x ^ A[i];
                }else{
                	
                }
              }
              }
           if(x == 0){System.out.println(0);}else{System.out.println(1);}
            }
            }
        }
    