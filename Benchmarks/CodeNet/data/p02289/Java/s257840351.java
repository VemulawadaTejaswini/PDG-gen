import java.util.Scanner;

public class Main {
    static int max = 2000001;
    static int[] T = new int[max];
    static int H = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oper;
        while (true){
            oper = sc.next();
            if("end".equals(oper)){
                break;
            }
            else if("insert".equals(oper)){
                int v = sc.nextInt();
                insert(v);
            }
            else if("extract".equals(oper)){
                System.out.println(extractX());
            }
        }
    }


    static void insert(int key){
        H++;
        heapIncreaseKey(key,H);

    }


    static void heapIncreaseKey(int key,int i){
        if(key < 0){
            return;
        }
        T[i] = key;
        while (i > 1 && T[i/2] < key){
            T[i] = T[i/2];
            T[i/2] = key;
            i = i/2;
        }
    }


    static int extractX(){
        if(H < 1) return -1;

        int max = T[1];
        T[1] = T[H];
        H--;
        maxHeapify(1);
        return max;
    }



    static void maxHeapify(int i){
        while (i <= H){
            int l = left(i);
            int r = right(i);
            int largest = i;
            if(l <= H && T[i] < T[l]){
                largest = l;
            }
            if(r <= H && T[largest] < T[r]){
                largest = r;
            }

            if(largest != i){
                int v = T[i];
                T[i] = T[largest];
                T[largest] = v;
//                maxHeapify(largest);
                i = largest;
            }else{
                break;
            }
        }

    }

    static int left(int u){
        return 2 * u;
    }

    static int right(int u){
        return 2 * u + 1;
    }
}

