import java.util.Scanner;


class Main {

    
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        String a=in.next();
        String str="";
        for(int i=0;i<a.length();i++) {
            int asc = (int) a.charAt(i);
            if((asc+b)<=90) {
                char as = (char) (asc+b);
                str+=as;
            } 
            else{
                char as = (char) ((asc-26) + b);
                str+=as;
            }
        }
        System.out.println(str);   
        
        
    }
    
   
}
   