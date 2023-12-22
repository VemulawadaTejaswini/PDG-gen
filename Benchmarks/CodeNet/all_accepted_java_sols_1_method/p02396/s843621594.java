import java.util.Scanner;

	class Main{
		public static void main(String[]args){
            
            
        Scanner sc=new Scanner(System.in);
            int x,i=0;
            x=sc.nextInt();
            if(x!=0){
          	  do{
                  i++;
                System.out.println("Case "+i+": "+x);
                  x=sc.nextInt();
          	  }while(x!=0);
            sc.close();
            }
        }
    }
