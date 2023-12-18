import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S  = sc.next();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList <String>List = new ArrayList<>();
        List.add("A");
        List.add("T");
        List.add("G");
        List.add("C");
        int num=0;
        for(int i=0;i<S.length();i++){
            char s = S.charAt(i);
            if(List.contains(String.valueOf(s))==true){
                num+=1;
                list.add(num);
            }
            else{
                num=0;
                list.add(num);
            }
        }
        System.out.println(Collections.max(list));
    }
}
