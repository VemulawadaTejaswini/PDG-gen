import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str0 = sc.next();
        int max = 0;
        for(int i = 0; i < num; i++){
        	String str1 = str0.substring(0,i);
            String str2 = str0.substring(i);
            int count = 0;
            ArrayList<String> list = new ArrayList<>();
            for(int x = 0; x < i; x++){
            	if(str2.contains(str1.substring(x, x + 1)) && list.contains(str1.substring(x, x + 1)) == false){
                	list.add(str1.substring(x, x + 1));
                    count++;
                }
                if(max < count){
                	max = count;
                }
            }
        }
        System.out.println(max); 
    }
}