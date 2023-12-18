class Main{
    public static void main(String[] args){
        int secTime = Integer.parseInt(args[0]);
        int ansSec = secTime % 60;
        int min = secTime / 60;
        int ansMin = min % 60;
        int ansHour = min / 60;
        System.out.println(ansHour + ":" + ansMin + ":" + ansSec);
    }
}