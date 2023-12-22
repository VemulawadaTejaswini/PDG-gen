import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        // String arr = new String[N];
        List<String> arr = new ArrayList<String>();
        for(int i = 0; i < N;i++){
            arr.add(String.valueOf(S.charAt(i)));
        }
        for(int j = 0; j < N-1; j++){
            if(arr.get(j).equals(arr.get(j+1))){
                arr.set(j, "0");
            }
        }
        // List<String> remove = new ArrayList<>();
        // arr.removeAll("0");
        arr.removeAll(Arrays.asList("0"));


        System.out.println(arr.size());
    }
}