import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tarou_point = 0;
        int hanako_point = 0;
        int n = sc.nextInt();
        while(true){
            for(int i = 0;i < n;i++) {
            	String tarou = sc.next();
                String hanako = sc.next();
            	if(tarou.compareTo(hanako) < 0){
                    hanako_point = hanako_point + 3;
                }else if(tarou.compareTo(hanako) > 0){
                    tarou_point = tarou_point + 3;
                }else if(tarou.compareTo(hanako) == 0){
                    tarou_point++;
                    hanako_point++;
                }
            }
            System.out.println(tarou_point + " " + hanako_point);
            break;
        }
    }
}
