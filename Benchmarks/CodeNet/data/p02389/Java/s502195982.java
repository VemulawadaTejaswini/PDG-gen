class Main {
    public static void main(String[] args) {
        int[] side = new int[2];
        
        for (int i = 0; side.length; i++) {
            side[i] = Integer.parseInt(args[i]);
        }

        int area = side[0] * side[1];
        int areaLength = ( side[0] + side[1] ) * 2;

        System.out.println(area + " " + areaLength);
    }
}