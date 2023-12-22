
import java.util.*;


public class Main {

    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] strArray = str.split("");
        List<String> list = new ArrayList<>();

        for (int tmp = 0; tmp < strArray.length ; tmp++) {
            list.add(strArray[tmp]);

        }

        boolean flagfirst = false;
        String a = list.get(0);
        for (int tmp = 1; tmp < list.size() ; tmp++) {
            if(list.get(tmp).equals(list.get(0))){

                list.remove(tmp);
                list.remove(0);
                flagfirst=true;
            }
        }
        boolean secondflag = false;


        if(list.size() == 2){
            if(list.get(0).equals(list.get(1))){
                secondflag = true;
            }

        }
        if(a.equals(list.get(0))) secondflag = false;

        if(flagfirst && secondflag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }
}
