import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Map.Entry<String, Integer>> spMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            Map.Entry<String, Integer> entry = new AbstractMap.SimpleEntry<>(scanner.next(), scanner.nextInt());
            spMap.put(i, entry);
        }
        scanner.close();

        List<Map.Entry<Integer, Map.Entry<String, Integer>>> entryList = new ArrayList<>(spMap.entrySet());

        //compareを使用して値を比較する
        Collections.sort(entryList, (obj1, obj2) -> {
            //降順
            return obj2.getValue().getValue().compareTo(obj1.getValue().getValue());
        });

//        entryList.forEach(integerEntryEntry -> {
//            Map.Entry<String,Integer> map = integerEntryEntry.getValue();
//            System.out.println(map.getKey()+" "+map.getValue());
//        });
//
//        System.out.println("========");

        // keyを昇順
        Collections.sort(entryList, Comparator.comparing(obj -> obj.getValue().getKey()));

//        entryList.forEach(integerEntryEntry -> {
//            Map.Entry<String,Integer> map = integerEntryEntry.getValue();
//            System.out.println(map.getKey()+" "+map.getValue());
//        });

        // out
        entryList.forEach(entry ->
                System.out.println((entry.getKey()+1))
        );
//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
