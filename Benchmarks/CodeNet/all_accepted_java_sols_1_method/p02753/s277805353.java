import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

String S=sc.nextLine();

if(S.contains("A")&&S.contains("B")){
 System.out.println("Yes");
}else{
 System.out.println("No");
}
}
}
