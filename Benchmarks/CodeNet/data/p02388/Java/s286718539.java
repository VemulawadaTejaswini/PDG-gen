public class Main {
    public static void main(String[] args) {

        if (args.length != 1){
            System.out.println("?????°???1????????????????????????");
            System.exit(1);
          }

        String seedStr= args[0];
        Integer seed = Integer.valueOf(seedStr);
        System.out.println((int) Math.pow(seed.doubleValue(), 3.0));
    }
}