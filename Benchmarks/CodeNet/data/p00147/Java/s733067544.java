import java.util.*;

class Fukushimaken {

    int [] seats;
    ArrayList<Eater> eating;

    Fukushimaken () {
        seats = new int[17];
        for (int i = 0; i < 17; i++)    seats[i] = -1;
        eating = new ArrayList<Eater>();
    }

    boolean acceptEater (Eater eater) {
        int n = eater.size;

        if (n == 2) {
            for (int i = 0; i < 16; i++) {
                if (seats[i] == -1 && seats[i+1] == -1) {
                    eating.add(eater);
                    eater.setSeatNum(i);
                    seats[i] = eater.groupNum;
                    seats[i+1] = eater.groupNum;
                    return true;
                }
            }
        }
        else if (n == 5) {
            for (int i = 0; i < 13; i++) {
                if (seats[i] == -1 && seats[i+1] == -1 && seats[i+2] == -1 && seats[i+3] == -1 && seats[i+4] == -1) {
                    eating.add(eater);
                    eater.setSeatNum(i);
                    for(int j = 0; j < 5; j++)  seats[i+j] = eater.groupNum;
                    return true;
                }
            }
        }

        return false;
    }

    void removeEater (int time) {
        for (int i = 0; i < eating.size(); i++) {
            Eater e = eating.get(i);
            if (time == e.getEnterTime() + e.existTime) {
                for (int k = 0; k < e.size; k++) {
                    this.seats[e.getSeatNum() + k] = -1;
                }
                eating.remove(i); 
            }
        }
    }
    
}

class Eater {

    int groupNum;
    int comeTime;
    int size;
    int existTime;
    private int enterTime;
    private int seatNum;
    
    Eater (int groupNum) {
        this.groupNum = groupNum;
        this.comeTime = groupNum * 5;

        if (groupNum % 5 == 1)  this.size = 5;
        else                    this.size = 2;

        this.existTime = 17 * (groupNum % 2) + 3 * (groupNum % 3) + 19;
    }

    void setEnterTime (int time) {
        this.enterTime = time;
    }

    int getEnterTime () {
        return this.enterTime;
    }

    void setSeatNum (int seat) {
        this.seatNum = seat;
    }

    int getSeatNum () {
        return this.seatNum;
    }
}

class Main {

    static Fukushimaken fuk;
    static ArrayList<Eater> allEaters;

    static void solve () {
        
        ArrayList<Eater> waitingEaters = new ArrayList<Eater>();

        for(int t = 0; t < 5000; t++) {
            fuk.removeEater(t);
            if (t % 5 == 0 && t < 500)     waitingEaters.add(allEaters.get(t/5));
            while ((!waitingEaters.isEmpty()) && fuk.acceptEater(waitingEaters.get(0))) {
                int n = waitingEaters.get(0).groupNum;
                allEaters.get(n).setEnterTime(t);
                waitingEaters.remove(0);
            }

//            System.out.printf("%3d: ", t);
//            for(int i = 0; i < 17; i++) {
//                int j = fuk.seats[i];
//                if ( j == -1 )  System.out.print("__");
//                else if ( j < 10 )   System.out.printf("0%d", j);
//                else    System.out.print(j);
//            }
//            System.out.println("");

        }
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        fuk = new Fukushimaken();
        allEaters = new ArrayList<Eater>();

        for(int i = 0; i < 100; i++) {
            allEaters.add(new Eater(i));
        }

        solve();

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println( allEaters.get(n).getEnterTime() - allEaters.get(n).comeTime );
        }

    }
}