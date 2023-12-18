import java.util.*;
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> prime = new LinkedList<Integer>();
        prime.add(2);
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int in = s.nextInt();
            int last = prime.getLast().intValue();
            if (in>last){
                for(int i = last + 1 ; i <= in ; i++){
                    boolean flag = true;
                    int j = 0;
                    while (prime.get(j).intValue() <= Math.sqrt(in)){
                        if(i % prime.get(j).intValue() == 0){
                            flag = false;
                            break;
                        }
                        if(j != (prime.size() - 1))
                            j++;
                        else{
                            if(i % prime.get(j).intValue() == 0){
                                flag = false;
                                break;
                            }
                        }
                    }
                    if(flag){
                        prime.add(i);
                    }
                }
                System.out.println(prime.size());
            }else{
                int k = 0;
                while (in<prime.get(k).intValue()){
                    if(k != prime.size() - 1)
                        k++;
                    else
                        break;
                }
                System.out.println(k);
            }
        }
    }
}