import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0;i < n;i++){
            array[i] = sc.nextInt();
        	result.add(new ArrayList<>());
        }
        for(int i = 0;i < n;i++){
            for(int j = 1;j <= array[i];j++){
                if(array[i] % j == 0){
                    result.get(i).add(j);
                }else{
                    continue;
                }
            }
        }
        for(int j = 0;j < result.get(1).size();j++){
            if(result.get(0).contains(result.get(1).get(j))){
                int tmp = result.get(1).get(j);
                if(n <= 2 || result.get(2).contains(tmp)){
                    answer.add(tmp);
                }
            }
        }
        for(int a : answer){
            System.out.println(a);
        }
    }
}
