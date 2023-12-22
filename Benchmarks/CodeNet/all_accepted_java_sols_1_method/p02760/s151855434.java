import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> gyou1 = new ArrayList<>();
        List<Integer> gyou2 = new ArrayList<>();
        List<Integer> gyou3 = new ArrayList<>();

        gyou1.add(sc.nextInt());
        gyou1.add(sc.nextInt());
        gyou1.add(sc.nextInt());
        gyou2.add(sc.nextInt());
        gyou2.add(sc.nextInt());
        gyou2.add(sc.nextInt());
        gyou3.add(sc.nextInt());
        gyou3.add(sc.nextInt());
        gyou3.add(sc.nextInt());

        List<Integer> retsu1 = new ArrayList<>();
        List<Integer> retsu2 = new ArrayList<>();
        List<Integer> retsu3 = new ArrayList<>();

        retsu1.add(gyou1.get(0));
        retsu1.add(gyou2.get(0));
        retsu1.add(gyou3.get(0));

        retsu2.add(gyou1.get(1));
        retsu2.add(gyou2.get(1));
        retsu2.add(gyou3.get(1));

        retsu3.add(gyou1.get(2));
        retsu3.add(gyou2.get(2));
        retsu3.add(gyou3.get(2));

        List<Integer> naname1 = new ArrayList<>();
        List<Integer> naname2 = new ArrayList<>();

        naname1.add(gyou1.get(0));
        naname1.add(gyou2.get(1));
        naname1.add(gyou3.get(2));

        naname2.add(gyou3.get(0));
        naname2.add(gyou2.get(1));
        naname2.add(gyou1.get(2));

        int selectNum = sc.nextInt();
        for(int i = 0; i < selectNum; i++){
            int check = sc.nextInt();

            for(int j = 0; j < 3; j++){
                if(check == gyou1.get(j)) gyou1.set(j, 101);
                if(check == gyou2.get(j)) gyou2.set(j, 101);
                if(check == gyou3.get(j)) gyou3.set(j, 101);

                if(check == retsu1.get(j)) retsu1.set(j, 101);
                if(check == retsu2.get(j)) retsu2.set(j, 101);
                if(check == retsu3.get(j)) retsu3.set(j, 101);

                if(check == naname1.get(j)) naname1.set(j, 101);
                if(check == naname2.get(j)) naname2.set(j, 101);
            }
            
        }

        boolean isBingo = false;

        if(gyou1.get(0) + gyou1.get(1) + gyou1.get(2) == 303){
            isBingo = true;
        }

        if(gyou2.get(0) + gyou2.get(1) + gyou2.get(2) == 303){
            isBingo = true;
        }

        if(gyou3.get(0) + gyou3.get(1) + gyou3.get(2) == 303){
            isBingo = true;
        }

        if(retsu1.get(0) + retsu1.get(1) + retsu1.get(2) == 303){
            isBingo = true;
        }

        if(retsu2.get(0) + retsu2.get(1) + retsu2.get(2) == 303){
            isBingo = true;
        }

        if(retsu3.get(0) + retsu3.get(1) + retsu3.get(2) == 303){
            isBingo = true;
        }

        if(naname1.get(0) + naname1.get(1) + naname1.get(2) == 303){
            isBingo = true;
        }

        if(naname2.get(0) + naname2.get(1) + naname2.get(2) == 303){
            isBingo = true;
        }
            
        if(isBingo) System.out.println("Yes");
        else System.out.println("No");
    }
}