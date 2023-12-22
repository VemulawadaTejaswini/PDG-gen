import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String line =sc.nextLine();
char change;


int length = line.length();

for (int i = 0; i < length; i++) {
char ch = line.charAt(i);

if(Character.isLowerCase(ch)){//これだけで小文字なら、が判別できる
   change= Character.toUpperCase(ch);
}else if(Character.isUpperCase(ch)){
   change= Character.toLowerCase(ch);
}else{
    change=ch;
}

    System.out.printf("%c",change);

}
System.out.printf("\n");


    sc.close();
}

}
