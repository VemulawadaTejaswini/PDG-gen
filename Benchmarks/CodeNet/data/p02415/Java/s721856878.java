import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            String T=sc.nextLine();
            for(int i=0;i<T.length();i++){
            	if(Character.isUpperCase(T.charAt(i)))
                    System.out.print(Character.toLowerCase(T.charAt(i)));
                else if(Character.isLowerCase(T.charAt(i)))
                    System.out.print(Character.toUpperCase(T.charAt(i)));
                else 
                    System.out.print(T.charAt(i));
        } 
        System.out.println();
        sc.close();
    }
}
