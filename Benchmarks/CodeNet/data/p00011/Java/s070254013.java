import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner _____ = new Scanner(System.in);
        int _________ = _____.nextInt();
        int ___________ = _____.nextInt();
        ArrayList<Integer> __________ = new ArrayList<Integer>();
        for (int ________ = 0; ________ < _________; ________++) {
            __________.add(________);
        }
        for (int ________ = 0; ________ < ___________; ________++) {
            String[] ______ = _____.next().split(",");
            int __ = Integer.parseInt(______[0]) - 1;
            int ___ = Integer.parseInt(______[1]) - 1;
            int ___________________________ = __________.get(__);
            __________.set(__, __________.get(___));
            __________.set(___, ___________________________);
        }
        for (int ________ = 0; ________ < __________.size(); ________++) {
            System.out.println(__________.get(________) + 1);
        }
        _____.close();
    }
}

