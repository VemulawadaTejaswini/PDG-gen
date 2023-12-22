import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == 'B'){
                if(list.size()>0){
                list.remove(count-1);
                count--;
                }
            }else if(S.charAt(i) == '0'){
                list.add(0);
                count++;
            }else if(S.charAt(i) == '1'){
                list.add(1);
                count++;
            }
        }
        
        for (int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i));
        }
    }
}
