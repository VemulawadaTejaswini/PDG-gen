import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
StringBuilder sb = new StringBuilder();

while(n-->0){
    sb.append((char)('a'+n%26));
    n/=26;
}sb.reverse();
System.out.println(sb.toString());

        sc.close();
    }
}