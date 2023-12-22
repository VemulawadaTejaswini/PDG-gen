import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[4][13];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
        	String w=sc.next();
            int s=sc.nextInt();

            if(w.equals("S")){
                a[0][s-1]=1;
            }else if(w.equals("H")){
            	a[1][s-1]=1;
            }else if(w.equals("C")){
            	a[2][s-1]=1;
            }else{
            	a[3][s-1]=1;
            }
        }
        for(int i=0;i<4;i++){
        	for(int j=0;j<13;j++){
                if(a[i][j]==0){
                    if(i==0){
                        System.out.println("S "+(j+1));
            		}else if(i==1){
            			System.out.println("H "+(j+1));
           	 		}else if(i==2){
                    	System.out.println("C "+(j+1));
           		 	}else{
            			System.out.println("D "+(j+1));
                    }
                }
            }
        }
        sc.close();
    }
}
