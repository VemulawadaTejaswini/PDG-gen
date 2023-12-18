import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        while(sc.hasNext()){
            ans.add("" + primeCount(sc.nextInt()));
        }
    }
    static int primeCount(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2;i <= num;i++) list.add(i);
        for(int i = 0;i < list.size();i++){
            for(int j = i + 1;j < list.size();j++){
                if(list.get(j) % list.get(i) == 0) list.remove(j--);
            }
        }
        return list.size();
    }
}