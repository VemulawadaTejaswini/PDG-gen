import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();

        TreeSet<String> ids = new TreeSet<String>();

        for(int i = 0; i < n; i++){
            ids.add(sc.next());
        }

        int m = sc.nextInt();
        boolean nowopen = false;

        for(int i = 0; i < m; i++){
            String nowcome = sc.next();
            if(ids.contains(nowcome)){
                if(nowopen){
                    nowopen = !nowopen;
                    System.out.print("Closed by ");
                    System.out.println(nowcome);
                }else{
                    nowopen = !nowopen;
                    System.out.print("Opened by ");
                    System.out.println(nowcome);
                }
            }else{
                System.out.print("Unknown ");
                System.out.println(nowcome);
            }
        }
	}
}