import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int suma=0,sumb = 0;
            	if(n == 0)
                    break;
        	for(int i=0;i<n;i++){
           	 int a = sc.nextInt();
           	 int b = sc.nextInt();
            		if(a > b){
                	    suma += a + b;
                	}else if(a<b){
                 	   sumb += a + b;
               		}else{
                 	   suma += a;
                 	   sumb += b;
              		}
            }
            System.out.print(suma + " " + sumb);
            System.out.println();
        }
    }
}
