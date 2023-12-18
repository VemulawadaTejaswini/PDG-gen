class Main{
    public static void main(String[] args){
		int heights[] = { -1, -1, -1 };
		for (String strArg : args) {
			int arg = Integer.parseInt(strArg);
			if (heights[0] == -1) {
				heights[0] = arg;
			} else if (heights[1] == -1) {
				if (heights[0]< arg){
					heights[1] = heights[0];
					heights[0] = arg;
				}else{
					heights[1] = arg;
				}
			} else if (heights[2] == -1) {
				if (heights[1]< arg){
					if (heights[0]< arg){
						heights[2] = heights[1];
						heights[1] = heights[0];
						heights[0] = arg;
					}else{
						heights[2] = heights[1];
						heights[1] = arg;
					}
				}else{
					heights[2] = arg;
				}
			} else if (heights[2] < arg) {
				if (heights[1] < arg) {
					if (heights[0] < arg) {
						heights[2] = heights[1];
						heights[1] = heights[0];
						heights[0] = arg;
					}else{
						heights[2] = heights[1];
						heights[1] = arg;
					}
				}else{
					heights[2] = arg;
				}
			}
		}

		for(int height : heights){
			System.out.println(height);
		}
    }
}