import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=0;
        while(true){
            int m=sc.nextInt();
            int f=sc.nextInt();
            int r=sc.nextInt();
            if(m==-1&&f==-1&&r==-1){
                break;
            }  
              p=m+f;
                 if(80<=p){
                     System.out.println("A");
                 }
                 else if(m==-1){
                     System.out.println("F");
                 }
                 else if(f==-1){
                     System.out.println("F");
                 }     
            
                 else if(65<=p&&p<80){
                     System.out.println("B");
                 }
            	 else if(50<=p&&p<65||50<=r){
                     System.out.println("C");
                 }
             	 else if(30<=p&&p<50){
                     System.out.println("D");
                 }
                 else if(p<30){
                     System.out.println("F");
                 } 
            
        }
       sc.close();  
    }
}

