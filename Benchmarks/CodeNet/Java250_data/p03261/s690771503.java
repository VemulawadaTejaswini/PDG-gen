import java.util.*;

public class Main {
    public static void main(String[] main_1){
        Scanner scanner = new Scanner(System.in);
        int main_2 = scanner.nextInt();
        String[] main_3 = new String[main_2];
        for(int main_4 = 0;main_4 < main_2;main_4++){
            String main_5 = scanner.next();
            main_3[main_4] = main_5;
        }
        if(main_a(Arrays.asList(main_3))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean main_a(List<String> main_a_1){
        Set<String> main_a_2 = new HashSet<String>();
        for(String main_a_3 : main_a_1) {
            if(main_a_2.contains(main_a_3)) {
                return false;
            } else {
                main_a_2.add(main_a_3);
            }
        }
        for(int main_a_5 = 0;main_a_5 < main_a_1.size();main_a_5++){
            if(main_a_5 != 0){
                String main_a_6 = main_a_1.get(main_a_5 - 1);
                String main_a_7 = main_a_1.get(main_a_5);
                if(!main_a_6.substring(main_a_6.length() - 1).equalsIgnoreCase(main_a_7.substring(0, 1))){
                    return false;
                }
            }
        }
        return true;
    }
}