class Main{
    public static void main(String[] args){
        int secTime = Integer.parseInt(args[0]);
        int ansSec = secTime % 60;
        int ansMin = secTime / 60 % 60;
        int ansHour = secTime / (60 * 60);
        System.out.println(ansHour + ":" + ansMin + ":" + ansSec);
    }
}