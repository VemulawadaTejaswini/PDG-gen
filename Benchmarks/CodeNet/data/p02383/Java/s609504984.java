import java.util.Scanner;
class Main{
    public static int[] Efunc(int[] dice){
        int[] newdice = new int[6];
        newdice[0] = dice[3];
        newdice[1] = dice[1];
        newdice[2] = dice[0];
        newdice[3] = dice[5];
        newdice[4] = dice[4];
        newdice[5] = dice[2];
        return newdice;
    }
    public static int[] Wfunc(int[] dice){
        int[] newdice = new int[6];
        newdice[0] = dice[2];
        newdice[1] = dice[1];
        newdice[2] = dice[5];
        newdice[3] = dice[0];
        newdice[4] = dice[4];
        newdice[5] = dice[3];
        return newdice;
    }
    public static int[] Nfunc(int[] dice){
        int[] newdice = new int[6];
        newdice[0] = dice[1];
        newdice[1] = dice[5];
        newdice[2] = dice[2];
        newdice[3] = dice[3];
        newdice[4] = dice[0];
        newdice[5] = dice[4];
        return newdice;
    }
    public static int[] Sfunc(int[] dice){
        int[] newdice = new int[6];
        newdice[0] = dice[4];
        newdice[1] = dice[0];
        newdice[2] = dice[2];
        newdice[3] = dice[3];
        newdice[4] = dice[5];
        newdice[5] = dice[1];
        return newdice;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] dice = new int[6];
        for(int i = 0; i < 6; i++)dice[i] = scanner.nextInt();
        String cmdline = scanner.next();
        char cmd;
        for(int i = 0; i < cmdline.length(); i++){
            cmd = cmdline.charAt(i);
            if(cmd == 'E')dice = Efunc(dice);
            else if(cmd == 'S')dice = Sfunc(dice);
            else if(cmd == 'W')dice = Wfunc(dice);
            else if(cmd == 'N')dice = Nfunc(dice);
        }
        System.out.println(dice[0]);
    }
}
