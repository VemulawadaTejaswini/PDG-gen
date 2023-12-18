import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Reopard on 2014/07/03.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n, w, d, s, p, tmp, id;
        int[] areas;
        Peace[] peaces;
        while((n = sc.nextInt()) != 0 | (w = sc.nextInt()) != 0 | (d = sc.nextInt()) != 0){
            peaces = new Peace[n + 1];
            areas = new int[n + 1];
            peaces[0] = new Peace(w, d, 1);
            for(int i = 1; i <= n; i++){
                p = 0;
                id = sc.nextInt();
                s = sc.nextInt();

                for(int j = 0; j < i; j++){
                    if(peaces[j].getId() == id) p = j;
                    else if(peaces[j].getId() > id) peaces[j].id--;
                }

                if((tmp = s%peaces[p].getRound()) < peaces[p].getW()){
                    peaces[p] = new Peace(peaces[p].getW() - tmp, peaces[p].getD(), i);
                    peaces[i] = new Peace(tmp, peaces[p].getD(), i+1);
                    swap(peaces[p], peaces[i]);

                }else if((tmp = s%peaces[p].getRound()) < peaces[p].getW() + peaces[p].getD()){
                    tmp -= peaces[p].getW();
                    peaces[p] = new Peace(peaces[p].getW(), peaces[p].getD() - tmp, i);
                    peaces[i] = new Peace(peaces[p].getW(), tmp, i+1);
                    swap(peaces[p], peaces[i]);

                }else if((tmp = s%peaces[p].getRound()) < 2*peaces[p].getW() + peaces[p].getD()){
                    tmp -= peaces[p].getW() + peaces[p].getD();
                    peaces[p] = new Peace(peaces[p].getW() - tmp, peaces[p].getD(), i);
                    peaces[i] = new Peace(tmp, peaces[p].getD(), i+1);
                    swap(peaces[p], peaces[i]);

                }else{
                    tmp -= 2*peaces[p].getW() + peaces[p].getD();
                    peaces[p] = new Peace(peaces[p].getW(), peaces[p].getD() - tmp, i);
                    peaces[i] = new Peace(peaces[p].getW(), tmp, i+1);
                    swap(peaces[p], peaces[i]);
                }
            }


            for(int i = 0; i <= n; i++) areas[i] = peaces[i].getArea();
            Arrays.sort(areas);
            System.out.print(areas[0]);
            for(int i = 1; i <= n; i++){
                System.out.print(" " + areas[i]);
            }
            if(sc.hasNextLine()) System.out.println();
        }
    }

    static void swap(Peace a, Peace b){
        if(a.getArea() > b.getArea() && a.getId() < b.getId()){
            int tmp = b.id;
            b.setId(a.getId());
            a.setId(tmp);
        }
    }

    static class Peace{
        int w;
        int d;
        int area;
        int round;
        int id;

        Peace(int w, int d, int id){
            this.w = w;
            this.d = d;
            this.id = id;
            area = w*d;
            round = 2*d + 2*w;
        }

        public void setId(int id){
            this.id = id;
        }

        public int getId(){
            return id;
        }

        public int getW(){
            return w;
        }

        public void setW(int w){
            this.w = w;

        }

        public int getD(){
            return d;
        }

        public void setD(int d){
            this.d = d;
        }

        public int getRound(){
            return round;
        }

        public int getArea(){

            return area;
        }
    }
}