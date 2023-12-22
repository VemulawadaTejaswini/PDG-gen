import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        String HW = sn.nextLine();
        long H = Integer.valueOf(HW.split(" ")[0]);
        long W = Integer.valueOf(HW.split(" ")[1]);
        sn.close();
        long D = 0;


        if((H == 1) || (W == 1)){
            D = 1;
        }else {
            if((H % 2 == 1) && (W % 2 == 1)) {
                D = H * W / 2 + 1;
            }else {
                D = H * W / 2;
            }
        }

        System.out.println(D);
    }
}