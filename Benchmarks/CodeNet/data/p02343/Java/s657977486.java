import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by takaesumizuki on 2018/06/22.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer q = sc.nextInt();
        UnionFind uni = new UnionFind(n);

        while(q-- > 0){
            Integer com,x,y;
            com = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            if(com == 0){
                uni.merge(x,y);
            }else{
                if(uni.same(x,y)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }


        }

    }


    public class UnionFind {
        ArrayList<Integer> unions;

        /**
         * 0 ~ size - 1までの集合を
         *
         * @param size 集合のサイズ
         */
        UnionFind(Integer size) {
            this.unions = new ArrayList<>();
            for (Integer i = 0; i < size; i++) {
                this.unions.add(i);
            }
        }

        Integer find(Integer v) {
            if (unions.get(v).equals(v)) {
                return v;
            } else {
                Integer ret = find(this.unions.get(v));
                this.unions.set(v, ret);
                return find(ret);
            }
        }

        /**
         * v1の集合 を v2の集合にする
         *
         * @param v1
         * @param v2
         */
        void merge(Integer v1, Integer v2) {
            Integer v1Root = find(v1);
            Integer v2Root = find(v2);

            this.unions.set(v1Root, v2Root);
        }

        Boolean same(Integer v1, Integer v2) {
            return find(v1).equals(find(v2));
        }
    }
}

