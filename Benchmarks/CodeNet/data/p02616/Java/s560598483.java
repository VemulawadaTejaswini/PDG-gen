import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    int N,K;
    long MOD = 1000000007;
    TreeMap<Long, Long> counter;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();

        int plus = 0, minus = 0;
        boolean zero = false;

        counter = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            long in = scanner.nextLong();

            if(in > 0){
                plus++;
            } else if(in < 0){
                minus++;
            } else {
                zero = true;
                continue;
            }
            counter.put(in,counter.getOrDefault(in,0L)+1);
        }

        if(plus >= K || (K - plus) % 2 == 0){
            searchMax();
        } else if(zero){
            System.out.println(0);
        } else {
            searchMin();
        }

    }

    void searchMax(){
        long R = 1;

        long max1, max2, min1, min2;
        max1 = counter.floorKey(Long.MAX_VALUE);
        if (counter.get(max1) == 1){
            counter.remove(max1);
        } else {
            counter.put(max1, counter.get(max1)-1);
        }
        max2 = counter.floorKey(Long.MAX_VALUE);
        if (counter.get(max2) == 1){
            counter.remove(max2);
        } else {
            counter.put(max2, counter.get(max2)-1);
        }


        min1 = counter.ceilingKey(Long.MIN_VALUE);
        if (counter.get(min1) == 1){
            counter.remove(min1);
        } else {
            counter.put(min1, counter.get(min1)-1);
        }
        min2 = counter.ceilingKey(Long.MIN_VALUE);
        if (counter.get(min2) == 1){
            counter.remove(min2);
        } else {
            counter.put(min2, counter.get(min2)-1);
        }

        while(K > 0){
            if(K == 1){
                R = R * max1 % MOD;
                K = 0;
            } else {
                if(max1 * max2 > min1 * min2){
                    R = (R * max1 % MOD) * max2 % MOD;

                    max1 = counter.floorKey(Long.MAX_VALUE);
                    if (counter.get(max1) == 1){
                        counter.remove(max1);
                    } else {
                        counter.put(max1, counter.get(max1)-1);
                    }
                    max2 = counter.floorKey(Long.MAX_VALUE);
                    if (counter.get(max2) == 1){
                        counter.remove(max2);
                    } else {
                        counter.put(max2, counter.get(max2)-1);
                    }
                } else {
                    R = R * (min1 * min2 % MOD) % MOD;

                    min1 = counter.ceilingKey(Long.MIN_VALUE);
                    if (counter.get(min1) == 1){
                        counter.remove(min1);
                    } else {
                        counter.put(min1, counter.get(min1)-1);
                    }
                    min2 = counter.ceilingKey(Long.MIN_VALUE);
                    if (counter.get(min2) == 1){
                        counter.remove(min2);
                    } else {
                        counter.put(min2, counter.get(min2)-1);
                    }
                }

                K -= 2;
            }
        }

        System.out.println(R);
    }

    void searchMin(){
        long R = 1;
        long plus, minus;

        if (counter.ceilingKey(0L) != null){
            plus = counter.ceilingKey(0L);
            if (counter.get(plus) == 1){
                counter.remove(plus);
            } else {
                counter.put(plus, counter.get(plus)-1);
            }
        } else {
            plus = Long.MAX_VALUE;
        }

        if (counter.floorKey(0L) != null){
            minus = counter.floorKey(0L);
            if (counter.get(minus) == 1){
                counter.remove(minus);
            } else {
                counter.put(minus, counter.get(minus)-1);
            }
        } else {
            minus = Long.MIN_VALUE;
        }

        while (K > 0){
            if(Math.abs(plus) > Math.abs(minus)){
                R = R * minus % MOD;
                if(R < 0) R += MOD;

                if (counter.floorKey(0L) != null){
                    minus = counter.floorKey(0L);
                    if (counter.get(minus) == 1){
                        counter.remove(minus);
                    } else {
                        counter.put(minus, counter.get(minus)-1);
                    }
                } else {
                    minus = Long.MIN_VALUE;
                }
            } else {
                R = R * plus % MOD;

                if (counter.ceilingKey(0L) != null){
                    plus = counter.ceilingKey(0L);
                    if (counter.get(plus) == 1){
                        counter.remove(plus);
                    } else {
                        counter.put(plus, counter.get(plus)-1);
                    }
                } else {
                    plus = Long.MAX_VALUE;
                }
            }
        }

        System.out.println((R);
    }

    public static void main(String[] args){
        new Main();
    }
}
