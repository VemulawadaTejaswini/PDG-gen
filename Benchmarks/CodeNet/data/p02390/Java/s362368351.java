class Main{
    public static void main(String[] args){
        int secTime = Integer.parseInt(args[0]);
        if (secTime == 0) {
            System.out.println("0:0:0");
            return;
        }
        int ansSec = secTime % 60;
        int min = secTime / 60;
        if (min == 0) {
            System.out.println("0:0:" + ansSec);
            return;
        }
        int ansMin = min % 60;
        int ansHour = secTime / (60 * 60);
        System.out.println(ansHour + ":" + ansMin + ":" + ansSec);
    }
}