public static void main(Integer[] list) {
	// write your code here
        Integer size = list.length;
        Integer max = 0;
        for (Integer i = 0; i < size; i++) {
            for (Integer j = i; j >= 0; j--) {
                Integer v = list[i] - list[j];
                max = v > max ? v : max;
            }
        }
        System.out.println(max);
    }
