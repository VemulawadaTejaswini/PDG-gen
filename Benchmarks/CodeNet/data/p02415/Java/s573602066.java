import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        String str = sc.nextLine();
        char[] cha = str.toCharArray();
        for(int i = 0; i < cha.length; i++)
            if(Character.isLowerCase(cha[i])){
                build.append(Character.toUpperCase(cha[i]));
            }else if(Character.isUpperCase(cha[i])){
                build.append(Character.toLowerCase(cha[i]));
            }else{
                build.append(cha[i]);
        }
        System.out.println(build.toString());
    }
}