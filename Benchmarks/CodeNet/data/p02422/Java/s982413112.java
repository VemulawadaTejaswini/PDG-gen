import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int command_num = sc.nextInt();
        for(int i = 0; i < command_num; i++){
            String command = sc.next();
            if(command.equals("replace")) {
            	int a = sc.nextInt();
            	int b = sc.nextInt();
            	String re = sc.next();
            	String before = str.substring(0,a);
            	String after = str.substring(b+1);
            	str = before + re + after;
            }
            if(command.equals("print")) {
            	int a = sc.nextInt();
            	int b = sc.nextInt();
            	System.out.println(str.substring(a,b+1));
            }
            if(command.equals("reverse")) {
            	int a = sc.nextInt();
            	int b = sc.nextInt();
            	String before = str.substring(0,a);
            	String after = str.substring(b+1);
            	String temp = "";
            	for(int j = b; j >= a; j--) {
            		temp += str.charAt(j);
            	}
            	str = before + temp + after;
            }
                }
            }
        }
