import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long hp = scan.nextLong();
        scan.close();
        long count = 2;
        int jyosu = 0; //hpは2の何乗か?

        if(hp == 1) System.out.println(count - 1);
        else{
            while(hp != 1){
                hp = hp / 2;
                jyosu++;
            }

            for(int i = 0;i < jyosu;i++) count = count * 2;
            System.out.println(count - 1);
        }
        /*
        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(scan.nextInt());
        int count = 0;
        scan.close();

        while(!h.isEmpty()){
            int hp = h.get(0);
            h.remove(0);
            if(hp != 1){
                hp = hp / 2;
                h.add(hp);
                h.add(hp);
            }
            count++;
        }
        System.out.println(count);
        */
    }


}