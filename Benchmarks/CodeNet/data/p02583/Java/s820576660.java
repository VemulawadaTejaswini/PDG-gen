import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lengthList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            lengthList.add(sc.nextInt());
        }

        lengthList = sort(lengthList);

        for(int i = 0; i<n-1; i++){
            while(lengthList.get(i) == lengthList.get(i+1)){
                lengthList.remove(i);
                n--;
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(lengthList.get(i) + lengthList.get(j) > lengthList.get(k)){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    
    private static ArrayList<Integer> sort(ArrayList<Integer> list){
        int n = list.size();
        for(int i = 1; i<n; i++){
            for(int j = 0; j<n-i; j++){
                if(list.get(j) > list.get(j+1)){
                    int tmp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        return list;
    }
}