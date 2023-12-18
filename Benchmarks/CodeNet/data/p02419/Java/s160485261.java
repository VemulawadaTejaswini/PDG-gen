import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String BRAKEW="END_OF_TEXT";
        int count=0;
        while(sc.hasNext()) {
            String str = sc.nextLine();
            str = str.toLowerCase();


            while(str.contains(key)) {
            	count++;
            	str = str.replaceFirst(key,"0");//最初のひとつだけ置換
            }
        }
        System.out.println(count);
        sc.close();
    }
}
