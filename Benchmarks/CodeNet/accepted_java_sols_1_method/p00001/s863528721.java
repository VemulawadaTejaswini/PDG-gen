import java.util.*;
 
class Main{
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            a.add(sc.nextInt());
        }
        a.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}