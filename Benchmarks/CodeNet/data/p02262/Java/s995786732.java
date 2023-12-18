import java.util.*;

class Main {
    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        int aryLen = scan.nextInt();
        int[] ary = new int[aryLen];
        int interCount = 1;
        int sortCount = 0;
        int maxInter = 0;
        

        for(int i = 0; i < aryLen; i++) {
            ary[i] = scan.nextInt();
        }
        
        int inter = 1;
        while(inter * 3 + 1 < aryLen ) {
            inter = inter * 3 + 1;
            interCount++;
        }

        maxInter = inter;

        for(; inter > 0 ; inter /= 3) {
            for(int j = inter; j < aryLen; j++) {
                int tmp = ary[j];
                int point = j;
                while(point - inter >= 0 && ary[point - inter] > tmp) {
                    ary[point] = ary[point - inter];
                    point -= inter;
                    sortCount++;    
                }
                ary[point] = tmp;
            }
            
        }
        System.out.println(interCount);
        for(; maxInter > 0; maxInter/=3) {
            System.out.print(maxInter);
            if(maxInter != 1) {
                System.out.print(" ");
            } else if(maxInter == 1) {
                System.out.println();
            }
        }
        System.out.println(sortCount);
        for(int k = 0; k < aryLen; k++) {
            System.out.println(ary[k]);
        }
    }
}

