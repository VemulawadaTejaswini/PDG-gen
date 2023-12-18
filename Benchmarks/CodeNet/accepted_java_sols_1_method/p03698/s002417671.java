import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        Map<String,Integer> map = new HashMap<>();

        int flag = 0;
        for(int i = 0;i<s.length;i++){
            if(map.get(s[i]) != null){
                flag++;
                System.out.println("no");
                break;
            }else{
                map.put(s[i],1);
            }
        }
        
        if(flag == 0){
            System.out.println("yes");
        }
    }
}