import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        ArrayList<String>po=new ArrayList<>();
        for(int i=1;i<=5&&i<=s.length();i++){
            for(int j=0;j<s.length()-i+1;j++){
                po.add(s.substring(j,j+i));
            }
        }
        ArrayList<String> list = new ArrayList<String>(new HashSet<>(po));
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}
