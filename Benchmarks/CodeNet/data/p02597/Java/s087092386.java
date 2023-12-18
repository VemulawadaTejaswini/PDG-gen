import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s=sc.next();
        char[] c=s.toCharArray();
        int temp=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='W' && c[i+1]=='R'){
                temp++;
            }
        }
        if(c[c.length-1]=='R' && temp!=0 && c[c.length-2]=='W'){
            temp++;
        }
        System.out.println(temp);
    }
}
