import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
        	String T=sc.nextLine();
            if(T.equals("0")) break;
        	int sum=0;
            for(int i=0;i<T.length();i++){                
                sum+=Character.getNumericValue(T.charAt(i));
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
