import java.util.*;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            String S = sc.next();
            if(S.equals("0")){
                break;
            }
            char[] c = S.toCharArray();
            int sum = 0;
            for(int i=0;i<c.length;i++){
                sum += (int)(c[i]-'0');
            }
            list.add(sum);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}

